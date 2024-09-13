package cn.tangjiabin.pft;

import cn.tangjiabin.pft.config.PFTConfig;
import cn.tangjiabin.pft.service.MemberService;
import cn.tangjiabin.pft.service.OrderService;
import cn.tangjiabin.pft.service.ScenicSpotService;
import cn.tangjiabin.pft.service.TicketService;
import cn.tangjiabin.pft.service.impl.MemberServiceImpl;
import cn.tangjiabin.pft.service.impl.OrderServiceImpl;
import cn.tangjiabin.pft.service.impl.ScenicSpotServiceImpl;
import cn.tangjiabin.pft.service.impl.TicketServiceImpl;

/**
 * SdkFactory
 *
 * @author 唐加彬
 * @version 1.0
 * @since 2024-09-11
 */

public class PFTFactory {

    private final PFTConfig config;

    public PFTFactory(PFTConfig config) {
        this.config = config;
    }

    public ScenicSpotService getScenicSpotService() {
        return new ScenicSpotServiceImpl(config);
    }

    public TicketService getTicketService() {
        return new TicketServiceImpl(config);
    }

    public MemberService getMemberService() {
        return new MemberServiceImpl(config);
    }

    public OrderService getOrderService() {
        return new OrderServiceImpl(config);
    }
}
