package fixtures.azurespecials;

import com.microsoft.rest.ServiceResponseWithHeaders;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import fixtures.azurespecials.implementation.AutoRestAzureSpecialParametersTestClientImpl;
import fixtures.azurespecials.implementation.HeaderCustomNamedRequestIdHeadersInner;


public class HeaderOperationsTests {
    private static AutoRestAzureSpecialParametersTestClientImpl client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestAzureSpecialParametersTestClientImpl("http://localhost.:3000", null);
    }

    @Test
    public void customNamedRequestId() throws Exception {
        ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner> response = client.headers().customNamedRequestId("9C4D50EE-2D56-4CD3-8152-34347DC9F2B0");
        Assert.assertEquals(200, response.getResponse().code());
        Assert.assertEquals("123", response.getHeaders().fooRequestId());
    }
}
