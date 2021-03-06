# 1. Spring基础
## (1)什么是Spring?
	是一个开源的，用来简化企业级应用开发的应用开发框架。
## (2)优点
	1)简化开发
	Spring框架对常用的一些api做了封装（比如，对jdbc的api就做了一些
	封装，直接使用jdbc访问数据库，比较繁琐，使用springjdbc访问数据库，就很简洁，比如不用考虑如何获取连接与关闭连接等等）
	2)管理对象
	Spring框架可以帮我们管理对象之间的依赖关系，这样一来，模块之间
	的耦合度会大大降低，方便软件的维护。
	3)集成其它框架
	Spring框架可以将其它的一些框架集成进来（比如，可以将定时任务处理框架Quartz集成进来）。

# 2.Spring容器
## (1)Spring容器是什么?
	是Spring框架当中的一个核心模块，用来管理对象。
## (2)启动Spring容器
	step1.导包。
	step2.添加配置文件。
	step3.启动容器。
## (3)创建对象
	1)方式一　利用无参构造器
	step1. 为类添加无参构造器（或者缺省构造器）
	step2. 在配置文件当中，使用<bean>这个元素来配置。
	step3. 启动容器，然后调用getBean方法。
	2)方式二　静态工厂方法（了解）
	3)方式三　实例工厂方法（了解）	
![](s2.png)
## (4)生命周期的管理
	1)初始化 
		容器在创建实例之后，会调用该实例的初始化方法
	2)销毁　
		容器在关闭之前，会调用该实例的销毁方法。
![](s1.png)
## (5)作用域
	1)默认情况下，对于每一个bean元素，只会创建一个实例。
	2)如果作用域为prototype,则每调用一次getBean方法，就会创建一个新的对象。
##(6)延迟加载(了解)
	1)默认情况下，容器启动之后，会将所有作用域为singleton的bean先创建好。
	2)可以设置lazy-init=true,容器启动之后，就不再对作用域为singleton
	的bean进行创建相应的实例了。

# 3. IOC (Inversion Of Controll 控制反转)
## (1)IOC是什么?
	对象之间的依赖关系由容器来建立。
## (2)DI是什么(Dependency Injection 依赖注入)?
	容器通过调用对象提供的set方法或者其构造器来建立对象之间的
	依赖关系。
	注：IOC是目标，而DI是手段。
![](set2.png)
## (3)依赖注入的两种方式
	1)set方法注入
	step1. 添加相应的set方法。
	step2. 在配置文件当中，使用<property>元素来配置依赖注入的关系。
![](set.png)

	2)构造器注入
	step1.　添加相应的构造器。	
	step2. 在配置文件当中，使用<constructor-arg>元素来配置依赖注入的关系。
![](c1.png)
	
	




	
	