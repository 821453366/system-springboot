# system-springboot
#### 1.在intellij idea中创建一个spring boot项目
步骤如下：
![](http://upload-images.jianshu.io/upload_images/1616232-b9e255d6ddcf38f8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](http://upload-images.jianshu.io/upload_images/1616232-7e6d2975b5584f60.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](http://upload-images.jianshu.io/upload_images/1616232-b55ffebfde91dfbb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](http://upload-images.jianshu.io/upload_images/1616232-36bcd685b3e5d061.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
>完成傻瓜式操作后就可以创建一个springboot项目结构如下图

![](http://upload-images.jianshu.io/upload_images/1616232-ee39ebe0b4b31e2c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

---
#### 2.创建一个controller
```
@RestController
@RequestMapping("")
public class UserController {

    @RequestMapping("")
    public String index(){
        return "Hello World!";
    }
}
```
项目结构如下图所示
![](http://upload-images.jianshu.io/upload_images/1616232-cb851cc29286031b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
启动main函数控制台出现如下所示说明启动成功
![](http://upload-images.jianshu.io/upload_images/1616232-64d48967e9316b46.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
浏览器访问：默认端口8080
![](http://upload-images.jianshu.io/upload_images/1616232-e8d455fc04e5ce03.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

注解解释：@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。

---
#### 3.整合Mybatis到springboot
在pom中添加以下依赖
```
<!--===============添加mybatis依赖================-->
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
```
application.properties中添加配置
```
spring.datasource.url=jdbc:mysql://localhost:3306/web?useUnicode=true&characterEncoding=utf8
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```
创建数据表
```
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```
![](http://upload-images.jianshu.io/upload_images/1616232-152c2ca5c459416a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
浏览器输入访问接口：http://localhost:8080/query结果如图所示
![](http://upload-images.jianshu.io/upload_images/1616232-83b477c7b3b5d0ce.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
此时项目结构如下
![](http://upload-images.jianshu.io/upload_images/1616232-43258b8c2a58e919.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

注解:
`@ComponentScan`注解开启后会扫描到项目中所有注解
`@MapperScan` 可以替代dao层接口的`@mapper`注解，作用是：使用此注解可以注册 Mybatis 接口类

---
#### 4.设置静态资源前后缀
```
#配置静态资源前后缀
spring.mvc.view.prefix=/web/
spring.mvc.view.suffix=.html
```
设置PageController页面接口
```
@Controller
@RequestMapping
public class PageController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
```
访问接口：http://localhost:8080/index结果如下所示
  ![](http://upload-images.jianshu.io/upload_images/1616232-4e3fe31047d79357.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
此时项目结构如下所示:
![](http://upload-images.jianshu.io/upload_images/1616232-4d589aded6888412.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
---
>####所属文集：[SpringBoot学习](https://www.jianshu.com/nb/17480353)
>####项目地址：[GitHub](https://github.com/821453366/system-springboot)

