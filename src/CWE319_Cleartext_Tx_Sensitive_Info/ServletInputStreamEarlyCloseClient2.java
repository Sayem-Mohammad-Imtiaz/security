/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.undertow.servlet.test.streams;

import io.undertow.servlet.api.ServletInfo;
import io.undertow.servlet.test.util.DeploymentUtils;
import io.undertow.testutils.DefaultServer;
import io.undertow.testutils.HttpOneOnly;
import io.undertow.testutils.TestHttpClient;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.servlet.ServletException;
import java.io.OutputStream;
import java.net.ServerSocket;

import java.util.concurrent.TimeUnit;

/**
 * Tests the behaviour of the input stream when the connection is closed on the client side
 * <p>
 * https://issues.jboss.org/browse/WFLY-4827
 *
 * @author Stuart Douglas
 */
@RunWith(DefaultServer.class)
@HttpOneOnly
public class ServletInputStreamEarlyCloseClientSide2{

    public static final String SERVLET = "servlet";

    public static void setup() throws ServletException {
        java.net.ServerSocket s=new java.net.ServerSocket();
    }



}
