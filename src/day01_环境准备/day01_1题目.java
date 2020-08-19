package day01_环境准备;

public class day01_1题目 {
    //题目链接：
    // https://t.zsxq.com/qrJUBmq

    //21天Java打卡，第1期第1天0808
    //1、环境搭建：安装jdk，配置环境变量
    //
    //1、安装jdk
    //链接：https://pan.baidu.com/s/1P35Us7p8Viz51EGmbrVzvA
    //提取码：ee0s
    //下载后直接傻瓜式安装即可
    //
    //2、配置环境变量
    //电脑-属性---高级系统设置-高级---环境变量
    //jdk的安装目录
    //JAVA_HOME：C:\Program Files (x86)\Java\jdk1.8.0_144
    //CLASSPATH：.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
    //path下添加%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin
    //
    //3、验证是否安装成功
    //1、cmd下输入java -version，查看安装版本
    //C:\User>java -version
    //java version "1.8.0_144"
    //Java(TM) SE Runtime Environment (build 1.8.0_144-b01)
    //Java HotSpot(TM) Client VM (build 25.144-b01, mixed mode)
    //
    //4、运行helloworld
    //用记事本编写第一个程序HelloWorld.java
    //public class HelloWorld{
    //    public static void main(String[] args){
    //        System.out.println("HelloWorld");
    //    }
    //}
    //再命令行执行javac
    //生成class文件
    //再执行java  HelloWorld
    //打印输出HelloWorld
}
