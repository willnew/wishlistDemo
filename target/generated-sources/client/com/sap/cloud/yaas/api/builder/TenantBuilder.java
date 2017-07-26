
package com.sap.cloud.yaas.api.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{tenant}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #client()}</li>
 * </ul>
 * 
 */
public class TenantBuilder
    extends AbstractResourceBuilder<TenantBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{tenant}";
    /**
     * The static field for the <code>tenant</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TENANT = "tenant";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TENANT };

    /**
     * Creates a new instance of the {@link TenantBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{client}</code>.
     * 
     * @return an instance of {@link TenantClientBuilder}
     * 
     */
    public TenantClientBuilder client() {
        return new TenantClientBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{client}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #client()} method instead.
     * 
     * @return an instance of {@link TenantClientBuilder}
     * @param client the value of the <code>client</code> URI parameter
     * 
     */
    public TenantClientBuilder client(String client) {
        TenantClientBuilder resourceBuilder = new TenantClientBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillClient(client);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantBuilder.GetActionBuilder prepareGet() {
        return new TenantBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action for this resource.
     * 
     * @return an instance of {@link HeadActionBuilder}
     * 
     */
    public TenantBuilder.HeadActionBuilder prepareHead() {
        return new TenantBuilder.HeadActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantBuilder.AnyActionBuilder prepareAny() {
        return new TenantBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantBuilder.ArbitraryActionBuilder<TenantBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TenantBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantBuilder.AnyActionBuilder actionBuilder = new TenantBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TenantBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantBuilder.ArbitraryActionBuilder<TenantBuilder.DeleteActionBuilder>
    {


        /**
         * Creates a new instance of a {@link DeleteActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public DeleteActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.DELETE);
        }

        @Override
        protected TenantBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantBuilder.DeleteActionBuilder actionBuilder = new TenantBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantBuilder.DeleteActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>Content-Encoding</code> header value.
         * 
         * @param contentEncoding the value of the <code>Content-Encoding</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Content-Encoding</code> header set
         * 
         */
        public TenantBuilder.DeleteActionBuilder withContentEncoding(String contentEncoding) {
            return this.withSingleHeader("Content-Encoding", contentEncoding);
        }

        /**
         * Sets the <code>Accept-Encoding</code> header value.
         * 
         * @param acceptEncoding the value of the <code>Accept-Encoding</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Accept-Encoding</code> header set
         * 
         */
        public TenantBuilder.DeleteActionBuilder withAcceptEncoding(String acceptEncoding) {
            return this.withSingleHeader("Accept-Encoding", acceptEncoding);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.DeleteActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantBuilder.ArbitraryActionBuilder<TenantBuilder.GetActionBuilder>
    {


        /**
         * Creates a new instance of a {@link GetActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public GetActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.GET);
        }

        @Override
        protected TenantBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantBuilder.GetActionBuilder actionBuilder = new TenantBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>If-None-Match</code> header value.
         * 
         * @param ifNoneMatch the value of the <code>If-None-Match</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>If-None-Match</code> header set
         * 
         */
        public TenantBuilder.GetActionBuilder withIfNoneMatch(String ifNoneMatch) {
            return this.withSingleHeader("If-None-Match", ifNoneMatch);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>Content-Encoding</code> header value.
         * 
         * @param contentEncoding the value of the <code>Content-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Content-Encoding</code> header set
         * 
         */
        public TenantBuilder.GetActionBuilder withContentEncoding(String contentEncoding) {
            return this.withSingleHeader("Content-Encoding", contentEncoding);
        }

        /**
         * Sets the <code>Accept-Encoding</code> header value.
         * 
         * @param acceptEncoding the value of the <code>Accept-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Encoding</code> header set
         * 
         */
        public TenantBuilder.GetActionBuilder withAcceptEncoding(String acceptEncoding) {
            return this.withSingleHeader("Accept-Encoding", acceptEncoding);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }


    /**
     * An implementation of the {@link HeadActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for HEAD action.	 
     * 
     */
    public static class HeadActionBuilder
        extends TenantBuilder.ArbitraryActionBuilder<TenantBuilder.HeadActionBuilder>
    {


        /**
         * Creates a new instance of a {@link HeadActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public HeadActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.HEAD);
        }

        @Override
        protected TenantBuilder.HeadActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantBuilder.HeadActionBuilder actionBuilder = new TenantBuilder.HeadActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantBuilder.HeadActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>Content-Encoding</code> header value.
         * 
         * @param contentEncoding the value of the <code>Content-Encoding</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Content-Encoding</code> header set
         * 
         */
        public TenantBuilder.HeadActionBuilder withContentEncoding(String contentEncoding) {
            return this.withSingleHeader("Content-Encoding", contentEncoding);
        }

        /**
         * Sets the <code>Accept-Encoding</code> header value.
         * 
         * @param acceptEncoding the value of the <code>Accept-Encoding</code> header
         * @return a new instance of {@link HeadActionBuilder}, with the <code>Accept-Encoding</code> header set
         * 
         */
        public TenantBuilder.HeadActionBuilder withAcceptEncoding(String acceptEncoding) {
            return this.withSingleHeader("Accept-Encoding", acceptEncoding);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.HeadActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.HeadActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantBuilder.HeadActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

    }

}
