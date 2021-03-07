package com.cjunn.setool.dao.handler;

import com.cjunn.setool.core.model.BaseModel;
import com.cjunn.setool.core.model.HandlerType;
import com.cjunn.setool.core.model.IHandler;
import com.cjunn.setool.core.user.IUser;
import com.cjunn.setool.core.user.UserContextHolder;

import java.lang.reflect.Field;

/**
 * @ClassName CreatorNameRecordHandler
 * @Description TODO
 * @Author cjunn
 * @Date 2021/3/7 15:47
 * @Version
 */
public class CreatorNameRecordHandler implements IHandler {
    @Override
    public void handler(HandlerType type, BaseModel model, Field field) throws IllegalAccessException {
        if(HandlerType.INSERT.equals(type)){
            field.set(model, UserContextHolder.getUser().getUserName());
        }
    }
}
