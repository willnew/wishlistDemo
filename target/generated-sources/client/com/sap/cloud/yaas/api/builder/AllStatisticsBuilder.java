
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/statistics</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #total()}</li>
 * </ul>
 * 
 */
public class AllStatisticsBuilder
    extends AbstractResourceBuilder<AllStatisticsBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/statistics";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link AllStatisticsBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link AllStatisticsBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public AllStatisticsBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected AllStatisticsBuilder makeACopy(RequestParams newRequestParams) {
        return new AllStatisticsBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/total</code>.
     * 
     * @return an instance of {@link AllStatisticsTotalBuilder}
     * 
     */
    public AllStatisticsTotalBuilder total() {
        return new AllStatisticsTotalBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public AllStatisticsBuilder.GetActionBuilder prepareGet() {
        return new AllStatisticsBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public AllStatisticsBuilder.AnyActionBuilder prepareAny() {
        return new AllStatisticsBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends AllStatisticsBuilder.ArbitraryActionBuilder<AllStatisticsBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<AllStatisticsBuilder.AnyActionBuilder, Object> , HttpActionSettable<AllStatisticsBuilder.AnyActionBuilder>
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
        protected AllStatisticsBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final AllStatisticsBuilder.AnyActionBuilder actionBuilder = new AllStatisticsBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public AllStatisticsBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public AllStatisticsBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public AllStatisticsBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public AllStatisticsBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final AllStatisticsBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends AllStatisticsBuilder.ArbitraryActionBuilder<?> >
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
        extends AllStatisticsBuilder.ArbitraryActionBuilder<AllStatisticsBuilder.GetActionBuilder>
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
        protected AllStatisticsBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final AllStatisticsBuilder.GetActionBuilder actionBuilder = new AllStatisticsBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public AllStatisticsBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>Content-Encoding</code> header value.
         * 
         * @param contentEncoding the value of the <code>Content-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Content-Encoding</code> header set
         * 
         */
        public AllStatisticsBuilder.GetActionBuilder withContentEncoding(String contentEncoding) {
            return this.withSingleHeader("Content-Encoding", contentEncoding);
        }

        /**
         * Sets the <code>Accept-Encoding</code> header value.
         * 
         * @param acceptEncoding the value of the <code>Accept-Encoding</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Accept-Encoding</code> header set
         * 
         */
        public AllStatisticsBuilder.GetActionBuilder withAcceptEncoding(String acceptEncoding) {
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
        public AllStatisticsBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public AllStatisticsBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

    }

}
