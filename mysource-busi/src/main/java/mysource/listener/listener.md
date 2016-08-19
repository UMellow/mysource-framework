#Servlet监听器

> 监听对象的变化或事件的触发。  

> Servlet规范中定义了多种类型的监听器，用以监听ServletContext、HttpSession、ServletRequest域对象。

> 自Servlet 3.0开始，可以使用注解@WebListener定义监听器。
	
#分类

#####监听域对象自身的创建与销毁

* **ServletContextListener**

> 监听ServletContext域对象的创建与销毁

* **HttpSessionListener**

> 监听HttpSession域对象的创建与销毁

* **ServletRequestListener**

> 监听ServletRequest域对象的创建与销毁

#####监听域对象属性的增加与删除

* **ServletContextAttributeListener**

> 监听application作用域中属性的变化

* **HttpSessionAttributeListener**

> 监听session作用域中属性的变化

* **ServletRequestAttributeListener**

> 监听request作用域中属性的变化

#####监听绑定到HttpSession域对象中的某个对象的状态
	
