
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/total</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class AllStatisticsTotalBuilder
    extends AbstractResourceBuilder<AllStatisticsTotalBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/total";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link AllStatisticsTotalBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link AllStatisticsTotalBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public AllStatisticsTotalBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected AllStatisticsTotalBuilder makeACopy(RequestParams newRequestParams) {
        return new AllStatisticsTotalBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public AllStatisticsTotalBuilder.GetActionBuilder prepareGet() {
        return new AllStatisticsTotalBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public AllStatisticsTotalBuilder.AnyActionBuilder prepareAny() {
        return new AllStatisticsTotalBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends AllStatisticsTotalBuilder.ArbitraryActionBuilder<AllStatisticsTotalBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<AllStatisticsTotalBuilder.AnyActionBuilder, Object> , HttpActionSettable<AllStatisticsTotalBuilder.AnyActionBuilder>
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
        protected AllStatisticsTotalBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final AllStatisticsTotalBuilder.AnyActionBuilder actionBuilder = new AllStatisticsTotalBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public AllStatisticsTotalBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public AllStatisticsTotalBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public AllStatisticsTotalBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public AllStatisticsTotalBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final AllStatisticsTotalBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends AllStatisticsTotalBuilder.ArbitraryActionBuilder<?> >
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

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends AllStatisticsTotalBuilder.ArbitraryActionBuilder<AllStatisticsTotalBuilder.GetActionBuilder>
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
        protected AllStatisticsTotalBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final AllStatisticsTotalBuilder.GetActionBuilder actionBuilder = new AllStatisticsTotalBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public AllStatisticsTotalBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>Content-Encoding</code> header value.
         * 
         * @param contentEncoding the value of the <code>Content-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Content-Encoding</code> header set
         * 
         */
        public AllStatisticsTotalBuilder.GetActionBuilder withContentEncoding(String contentEncoding) {
            return this.withSingleHeader("Content-Encoding", contentEncoding);
        }

        /**
         * Sets the <code>Accept-Encoding</code> header value.
         * 
         * @param acceptEncoding the value of the <code>Accept-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Encoding</code> header set
         * 
         */
        public AllStatisticsTotalBuilder.GetActionBuilder withAcceptEncoding(String acceptEncoding) {
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
        public AllStatisticsTotalBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public AllStatisticsTotalBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }

}
