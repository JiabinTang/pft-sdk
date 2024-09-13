# pft-sdk

票付通SDK

## 项目简介

pft-sdk 是一个用于票付通的SDK，提供了与票付通平台进行交互的功能。

## 安装

要使用 pft-sdk，请确保您的项目使用 Maven 作为构建工具。将以下依赖项添加到您的 `pom.xml` 文件中：

```xml
<dependency>
    <groupId>cn.tangjiabin.pft</groupId>
    <artifactId>pft-sdk</artifactId>
    <version>1.0</version>
</dependency>
```

## 使用

```java
 public static void main(String[] args) {

        // 创建票付通配置
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");

        // 创建票付通工厂
        PFTFactory pftFactory = new PFTFactory(pftConfig);
        TicketService ticketService = pftFactory.getTicketService();

        // 创建请求
        TicketListRequest request = new TicketListRequest();
        request.setN("158579");
        
        Data<TicketListResponse> responseData = ticketService.getTicketList(request);
    
        System.out.println("门票列表：" + responseData);
}
```

## 许可证

此项目使用 Apache License 2.0 许可证。有关更多信息，请参阅 [LICENSE](LICENSE) 文件。



