/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.definition.model;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 * @author Gravitee.io Team
 */
public class HttpClient {

    private boolean useProxy = false;

    private HttpProxy httpProxy;

    private HttpClientOptions options = new HttpClientOptions();

    private HttpClientSslOptions ssl;

    public boolean isUseProxy() {
        return useProxy;
    }

    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    public HttpProxy getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(HttpProxy httpProxy) {
        this.httpProxy = httpProxy;
    }

    public HttpClientOptions getOptions() {
        return options;
    }

    public void setOptions(HttpClientOptions options) {
        this.options = options;
    }

    public HttpClientSslOptions getSsl() {
        return ssl;
    }

    public void setSsl(HttpClientSslOptions ssl) {
        this.ssl = ssl;
    }
}
