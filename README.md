**项目说明** 
- hxyFrame是后台管理系统，采用流行的框架springMvc+spring+mybatis+shiro+redis+ehcache开发,实现了权限管理（菜单权限、数据权限），solr全文搜索引擎，activiti工作流程引擎，cas单点登陆等功能，完善的代码生成器
后期还会考虑改造成模块微服务化,做到模块的相对独立，使用更加灵活，努力做到快速开发OA办公系统。
感兴趣可以Watch、Start持续关注项目最新状态，加入QQ群：210315502 解决各种疑难杂证，丰富的学习资源。


**项目功能** 
- 权限管理：采用Shiro实现功能权限和机构部门的数据控件权限，可控件菜单权限、按钮权限、机构部门权限（数据权限）
- 工作流程引擎：采用主流的activiti流程引擎,在原基础上扩展了动态添加审批人员范围选择、会签节点的动态设置、排它路由条件设置、
              节点可编辑字段设置、节点执行后回调函数、办理任务、驳回到发起人从新发起、退回到上一步、自由跳转、转办等功能。在开发的过程中，
              只需要简单业务流程树，尊守一些规则就可以很方便的使用流程，后面还考虑加入自定义表单，使开发变的更加简单。
- CAS单点登陆:整合cas+shiro单点登陆,实现多个系统统一登陆登出。
- 缓存：使用redis+ehcahe整合shiro自定义sessionDao实现分布式集群共享session，redis可采用单机方式，也可以集群哨兵模式。可以灵活的切换模式
- solr全文搜索引擎，最基本的增、删、改、查、关键字分页查询、带高亮的关键字查询，建立索引分为三种方式：
    1.CRUD时调用solr添加索引
    2.sql直接从数据库中导入索引 
    3.如果不需要实时，可以将先储存到一表,再写一定时任务每隔多久更新一次索引，对于不需要实时的需求，可以提高性能。
    目前还没合并到主干，开发的更加完善，后面回整合到项目。
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 页面交互使用了vue+html和最普通的jsp+jstl标签，两种交互都写了相应的模板，可以选择适合的交互方式。
- activitiMQ 消息中间件，目录还没在项目中使用，后期可能会加入，做分布式集群redis+ehcahe，节点间发送更新通知，可以会用redis的消息控件替代。
- 完善的代码生成机制，可在线生成entity、xml、dao、service、html、js、sql代码,可快速开发基本功能代码，能把更多的精力放在问题难点。
- 采用layer友好的弹框，和layerUI相对漂亮的界面，让OA系统看起来稍微好看点。

**项目结构** 

![项目结构](http://osaowv4s0.bkt.clouddn.com/upload/20170828/9906e6ef50914343ad7a896975f1fe7b "项目结构")


**项目信息** 
- 项目demo地址：http://47.95.234.81:8090/frame-admin 帐户/密码:hxy/a
- 开发文档：待完善
- oschina仓库：https://git.oschina.net/huangxianyuan/hxyFrame.git
- github仓库：https://github.com/huangxianyuan/hxyFrame.git
- 交流QQ群：210315502
- 麻烦帮忙Watch、Star项目，这样才能关注到项目的最新更新，谢谢亲的支持！

 **技术选型：**
  
- 核心框架：Spring Framework 4.3.7.RELEASE
- 工作流引擎：Activiti 5.22.0
- 全文搜索：Solr 6.5.1
- 单点登陆: cas 4.0.3
- 缓存：redis 3.07
- 消息中间件：activitiMQ 5.9.0
- 权限框架：Apache Shiro 1.3
- 视图框架：Spring MVC 4.3
- 持久层框架：MyBatis 3.3
- 数据库：mysql 5.7
- 定时器：Quartz 2.2.3
- 前端页面：Vue2.x、jstl、bootstrap、layer、layerUI


 **软件环境** 
- JDK1.7+
- MySQL5.7.17
- Maven3.0
- Tomcat7.0
- redis 3.07


 **本地部署**
- 创建数据库hxyframe，数据库编码为UTF-8
- 修改jdbc.properties文件，更新MySQL账号和密码
- redis服务,可以使用单机redis也可以配置哨兵集群模式，如果不会部署可以加群咨询：210315502
- 项目访问路径：http://127.0.0.1:8080/frame-admin/



**项目图片：**

![图片说明]( http://chuantu.biz/t6/49/1505438394x2728329119.png "图片说明")
![图片说明]( http://chuantu.biz/t6/49/1505438496x2728278883.png "图片说明")
![图片说明]( http://chuantu.biz/t6/49/1505438510x2728278883.png "图片说明")
![图片说明]( http://chuantu.biz/t6/49/1505438525x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438549x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438572x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438586x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438599x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438610x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438622x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438634x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438645x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438656x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438667x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438678x2728278883.png "图片说明")
![图片说明](http://chuantu.biz/t6/49/1505438690x2728278883.png "图片说明")



