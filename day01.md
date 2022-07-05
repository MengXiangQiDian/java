# Java开发步骤 #
+ hello表示一个类，是一个public公有类 
 `public class hello {}` 
+ hello{}表示一个类的开始和结束 
+ `public static void main(String[] args)` 表示一个主方法，即我们的程序的入口 
+ `main()` 表示方法的开始和结束 
+ `System.out.println("hello world!")` 表示输出“hello world!”到屏幕 
+ “;”表示语句结束    
## 1.编译 ##
通过javac编译.java文件生成.class文件 

## 2.运行 ##
通过java执行hello文件，输出结果hello world！

# java开发注意事项 #
+ 大括号都是成对出现的
+ 源文件包含一个public类，则文件名必须按该类名命名
+ java语言区分大小写
+ 一个源文件只能有一个public类，其他类个数不限

## java转义字符 ##
+  \t 空格
+  \n 换行
+  \ 转义字符

## 注释 ##
+ 单行注释 
    `//单行注释`
+ 多行注释
    `/*
		int n1=10;
		int n2=20;
		int sum=n1+n2;
		System.out.println(sum);*/`
+ 文档注释

## java代码规范 ##
1. 类、方法的注释要以javadoc的方式来写
2. 非Java doc的注释，是给代码的维护者看，着重告诉读者为什么这么写，如何修改
3. tab键实现缩进，默认向右移动，使用shift+tab整体向左移动
4. 运算符和 = 两边习惯性加一个空格
5. 源文件使用utf-8编码
6. 行宽度不超过80字符
7. 代码编写次行分格和行位风格