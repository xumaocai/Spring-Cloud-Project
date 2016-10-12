一、概述
---
	Spring boot不提供Spring框架的核心特性以及扩展功能，是用于快速、敏捷地开发新一代基于Spring框架的应用程序。
	也就是说它不是替代Spring的解决方案，而是和Spring框架紧密结合用于提升Spring开发者体验的工具，同时它集成了大
	量常用的第三方库配置（例如Jackson, JDBC, Mongo, Redis, Mail等等），Spring Boot应用中这些第三方库几乎可
	以零配置的开箱即用（out-of-the-box），大部分的Spring Boot应用都只需要非常少量的配置代码，开发者能够更加专注于业务逻辑。


二、开发
---
	1、外化配置
	yml文件格式分层存储，内部转json对象，dev、test、prod区分开发、测试、生产环境
	
	2、日志记录
	logback日志框架(根据日志等级选择性存储)，根据日期，存储大小等属性生成日志文件，可预设保留文件时长
	
	3、安全策略
	使用OAuth2认证协议，Spring Security或Shiro框架做权限认证
	
	4、数据层
	Spring Data JPA + Hibernate;JPA(Java Persistence API)是持久化规范，Hibernate是它的一种实现。
	1）提供统一的接口，可避免我们再次重复编写基础的DAO类
	2）遵循JPA规范，同时也提供了灵活的数据访问方式
	3）通过方法名即可自动生成HQL语句
	4）通过接口自动注入实现类，实现非常简单
	
	5、JSON REST服务
	@RestController默认渲染为JSON响应，内部使用Jackson2序列化(针对移动APP数据交互很便捷)
	
	6、任务调度（scheduled）
	定时执行任务，配置cron表达式
	
	7、热交换 --提高开发效率

	
三、测试
---
	1）Spring Test - 对Spring应用的集成测试支持
	2）JUint - 用于Java应用的单元测试
	3）Hamcrest - 一个匹配对象的库（也称为约束或前置条件），它允许assertThat等JUnit类型的断言。
	4）Mockito - 一个Java模拟框架
	
	
四、部署
---
	1）打包成jar执行命令启动，针对Web项目可以内嵌容器（Tomcat、Jetty）
	2）指定属性配置文件和运行端口
	java -jar xxx.jar --spring.profiles.active=dev --server.port=8081
	
	
五、监控
---
	引入spring boot执行器
	1）HTTP /health 检查应用的运行状态
	2）HTTP /info 查看应用的基本描述
	3）HTTP /metrics 度量指标,可以查看memory、heap、class loading、thread pool信息；URL返回次数、最后响应状态、最后耗时；
	   系统指标（系统内存数量、空闲内存数量、堆信息、类加载信息...）;数据源指标（最大连接数、最小连接数、活动连接数、连接池使用情况）;...


六、专题
---
	1、如何将现有的应用转换为Spring Boot
		参考官方说明：http://docs.spring.io/spring-boot/docs/1.4.1.RELEASE/reference/htmlsingle/
		#howto-convert-an-existing-application-to-spring-boot
	