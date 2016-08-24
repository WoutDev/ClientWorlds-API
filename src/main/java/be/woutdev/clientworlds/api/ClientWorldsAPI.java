package be.woutdev.clientworlds.api;

import be.woutdev.clientworlds.api.framework.API;

/**
 * Created by Wout on 24/08/2016.
 */
public class ClientWorldsAPI
{
    private static API API;

    public static API getAPI()
    {
        return API;
    }

    public static void setAPI(API api)
    {
        if (ClientWorldsAPI.API != null)
        {
            throw new RuntimeException("Cannot set API twice.");
        }

        ClientWorldsAPI.API = api;
    }
}
