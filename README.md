# pft-sdk

票付通SDK

## 项目简介

pft-sdk 是一个用于票付通的SDK，提供了与票付通平台进行交互的功能。

## 安装

要使用 pft-sdk，请确保您的项目使用 Maven 作为构建工具。将以下依赖项添加到您的 `pom.xml` 文件中：

```xml
<!-- Java 8 版本的依赖 -->
<dependency>
    <groupId>cn.tangjiabin.pft</groupId>
    <artifactId>pft-sdk</artifactId>
    <version>1.0</version>
</dependency>
<!-- Java 11 版本的依赖 或者缺少 javax.xml.soap 依赖的使用-->
<dependency>
    <groupId>cn.tangjiabin.pft</groupId>
    <artifactId>pft-sdk-java11</artifactId>
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

## Spring Boot 使用

```java

// 注册到 Spring 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PFTConfig {

    @Bean
    public PFTConfig pftConfig() {
        // 这里可以改成从配置文件获取
        PFTConfig pftConfig = new PFTConfig();
        pftConfig.setUrl("http://open.12301dev.com/openService/pftMX.php");
        pftConfig.setAc("xxxxxx");
        pftConfig.setPw("xxxxxx");
        return pftConfig;
    }

    @Bean
    public PFTFactory pftFactory(PFTConfig pftConfig) {
        return new PFTFactory(pftConfig);
    }

    @Bean
    public ScenicSpotService scenicSpotService(PFTFactory pftFactory) {
        return pftFactory.getScenicSpotService();
    }

    @Bean
    public TicketService ticketService(PFTFactory pftFactory) {
        return pftFactory.getTicketService();
    }

    @Bean
    public OrderService orderService(PFTFactory pftFactory) {
        return pftFactory.getOrderService();
    }

    @Bean
    public MemberService memberService(PFTFactory pftFactory) {
        return pftFactory.getMemberService();
    }
}

==============================================================
// 在业务类中使用

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class XXXService {
    // XXXService 为你自己的业务类
    private final TicketService ticketService;

    public void getTicketList() {
        // 创建请求
        TicketListRequest request = new TicketListRequest();
        request.setN("158579");

        Data<TicketListResponse> responseData = ticketService.getTicketList(request);

        System.out.println("门票列表：" + responseData);
    }

}

```

## 许可证

此项目使用 Apache License 2.0 许可证。有关更多信息，请参阅 [LICENSE](LICENSE) 文件。



