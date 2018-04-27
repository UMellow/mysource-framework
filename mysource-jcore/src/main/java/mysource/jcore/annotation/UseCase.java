package mysource.jcore.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.List;

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface UseCase {

	public String code(); 
	public String description() default "无描述信息";
}

class PasswordUtils {
	
	@UseCase(code="UC200-1", description="密码校验，需求人员：张三")
	public boolean validatePassword(String password) {
		return password.matches("\\w*\\d\\w*");
	}
	
	@UseCase(code="UC200-2", description="设置新密码校验，需求人员：李四")
	public boolean checkForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}

class UseCaseTracker {
	
	public static void trackerUseCases(List<String> useCases, Class<?> clazz) {
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			UseCase useCase = method.getDeclaredAnnotation(UseCase.class);
			if(useCase != null) {
				System.out.println(
						"已实现用例，code=" + useCase.code() + ", description=" + useCase.description());
				useCases.remove(useCase.code());
			}			
		}
		
		for(String code : useCases) {
			System.out.println("【警告】未实现用例编码，code=" + code);
		}
	}
}
