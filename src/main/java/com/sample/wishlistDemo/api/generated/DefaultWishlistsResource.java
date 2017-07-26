
package com.sample.wishlistDemo.api.generated;

import java.net.URI;
import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sap.cloud.yaas.api.DocumentClient;
import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.DiagnosticContext;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionCallback;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;
import com.sap.cloud.yaas.servicesdk.patternsupport.schemas.ResourceLocation;


/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiWishlistsResource")
@Singleton
public class DefaultWishlistsResource implements WishlistsResource
{
	@javax.ws.rs.core.Context
	private UriInfo uriInfo;
	private static final String WISHLIST_PATH = "wishlist";
    @Inject
    private DocumentClient documentClient;
    @Inject
    private AuthorizedExecutionTemplate authorizedExecutionTemplate;
    @Value("${TENAT}")
    private String tenat;
    @Value("${CLIENT}")
    private String client;
    @Value("${CLIENT_ID}")
    private String clientId;

    /* GET / */
    @Override
	public Response get(final YaasAwareParameters yaasAware) {
		final Response response = authorizedExecutionTemplate.executeAuthorized(
			new AuthorizationScope(tenat, Arrays.asList("hybris.document_view")),
			new DiagnosticContext(clientId, yaasAware.getHybrisHop()),
			new AuthorizedExecutionCallback<Response>() {
				@Override
				public Response execute(final AccessToken token) {
					return documentClient.tenant(tenat)
						.client(client).dataType(WISHLIST_PATH).prepareGet()
						.withAuthorization(token.toAuthorizationHeaderValue()).execute();
				}
			});
		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			return Response.ok().entity(response.readEntity(Wishlist[].class)).build();
		} else {
			return Response.serverError().build();
		}
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Wishlist wishlist) {
		final Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(tenat, Arrays.asList("hybris.document_view",
					"hybris.document_manage")),
				new DiagnosticContext(clientId, yaasAware.getHybrisHop()),
				new AuthorizedExecutionCallback<Response>() {
				    @Override
				    public Response execute(final AccessToken token) {
					return
					documentClient.tenant(tenat)
						.client(client)
						.dataType(WISHLIST_PATH)
						.dataId(wishlist.getId())
						.preparePost()
						.withAuthorization(token.toAuthorizationHeaderValue())
						.withPayload(Entity.json(wishlist))
						.execute();
				    }
				});
			if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			    ResourceLocation location = response.readEntity(ResourceLocation.class);
			    URI createdLocation = uriInfo.getRequestUriBuilder().path("/" + location.getId()).build();
			    return Response.created(createdLocation).build();
			} else {
			    return Response.serverError().build();
			}
	}

	/* GET /{wishlistId} */
	@Override
	public Response getByWishlistId(final YaasAwareParameters yaasAware, final String wishlistId)
	{
		final Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(tenat, Arrays.asList("hybris.document_view")),
				new DiagnosticContext(clientId, yaasAware.getHybrisHop()),
				new AuthorizedExecutionCallback<Response>() {
					@Override
					public Response execute(final AccessToken token) {
						return documentClient
								.tenant(tenat)
								.client(client)
								.dataType(WISHLIST_PATH)
								.dataId(wishlistId)
								.prepareGet()
								.withAuthorization(token.toAuthorizationHeaderValue())
								.execute();
					}
				});
		
		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			return Response.ok().entity(response.readEntity(Wishlist.class)).build();
		} else {
			// since I could not separate empty response and server error,
			// just return empty for interview
			// place some logic here
			return Response.ok().entity(new Wishlist()).build();		
		}
	}

	/* PUT /{wishlistId} */
	@Override
	public Response putByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId, final Wishlist wishlist)
	{
		final Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(tenat, Arrays.asList("hybris.document_view", "hybris.document_manage")),
				new DiagnosticContext(clientId, yaasAware.getHybrisHop()),
				new AuthorizedExecutionCallback<Response>() {
					@Override
					public Response execute(final AccessToken token) {
						return documentClient
								.tenant(tenat)
								.client(client)
								.dataType(WISHLIST_PATH)
								.dataId(wishlistId)
								.preparePut()
								.withAuthorization(token.toAuthorizationHeaderValue())
								.withPayload(Entity.json(wishlist))
								.execute();
					}
				});
		
		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
		    ResourceLocation location = response.readEntity(ResourceLocation.class);
		    URI createdLocation = uriInfo.getRequestUriBuilder().path("/" + location.getId()).build();
		    return Response.created(createdLocation).build();
		} else {
		    return Response.serverError().build();
		}
	}

	/* DELETE /{wishlistId} */
	@Override
	public Response deleteByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

	@Override
	public
	Response getByWishlistIdWishlistItems(
			final YaasAwareParameters yaasAware,  final java.lang.String wishlistId)
	{
		// place some logic here
		return Response.ok()
				.entity(new java.util.ArrayList<WishlistItem>()).build();
	}

	@Override
	public
	Response postByWishlistIdWishlistItems(final YaasAwareParameters yaasAware,
			final java.lang.String wishlistId, final WishlistItem wishlistItem){
		// didn't implemented yet
		final Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(tenat, Arrays.asList("hybris.document_view",
					"hybris.document_manage")),
				new DiagnosticContext(clientId, yaasAware.getHybrisHop()),
				new AuthorizedExecutionCallback<Response>() {
				    @Override
				    public Response execute(final AccessToken token) {
					return documentClient.tenant(tenat)
						.client(client)
						.dataType(WISHLIST_PATH)
						.dataId(wishlistId)
						.attributeName("wishlistItems")
						.preparePost()
						.withAuthorization(token.toAuthorizationHeaderValue())
						.withPayload(Entity.json(wishlistItem))
						.execute();
				    }
				});
			if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			    ResourceLocation location = response.readEntity(ResourceLocation.class);
			    URI createdLocation = uriInfo.getRequestUriBuilder().path("/" + location.getId()).build();
			    return Response.created(createdLocation).build();
			} else {
			    return Response.serverError().build();
			}
	}

}
