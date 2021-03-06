/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cocoon.callstack.environment;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.FactoryBean;

/**
 * {@link FactoryBean} that exposes the {@link HttpServletResponse} in the
 * current call frame. It will typically be used together with the call scope.
 *
 * @version $Id: HttpServletResponseFactoryBean.java 608375 2008-01-03 08:33:00Z reinhard $
 * @since 1.0.0
 */
public final class HttpServletResponseFactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return CallFrameHelper.getResponse();
    }

    public Class getObjectType() {
        return HttpServletResponse.class;
    }

    public boolean isSingleton() {
        return true;
    }

}
