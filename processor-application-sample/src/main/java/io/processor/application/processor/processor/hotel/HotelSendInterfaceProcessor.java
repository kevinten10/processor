package io.processor.application.processor.processor.hotel;

import com.kevinten.vrml.core.serialization.Serialization;
import io.processor.application.processor.context.HotelContext;
import io.processor.application.processor.route.AppEventType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.w3c.dom.events.EventException;

/**
 * Hotel Send Processor
 */
@Slf4j
@Component
public class HotelSendInterfaceProcessor extends AbstractAppHotelInterfaceProcessor {

    @Override
    protected void doProcess(HotelContext context) throws EventException {
        log.info("[HotelSendProcessor.doProcess] context[{}]", Serialization.GSON.toJson(context));
    }

    /**
     * 基于Event进行路由
     */
    @Override
    protected AppEventType routeEvent() {
        return AppEventType.SEND;
    }
}
