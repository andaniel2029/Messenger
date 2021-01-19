package com.kids.chatapp.Fragments;

import com.kids.chatapp.Notifications.MyResponse;
import com.kids.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAOFAe7x8:APA91bHhaRxThsZFuN4Xcm92151CGkEk7QUFEgs_0e_MjSvfObYevkmD1wNn_Jo-kHdK8sDmzF3zS3HQK6qymg-1uDUFI7dqfSa-RAGPBZb5tDCc3VjyMvz0nx1Z_aanbp_h8iaIhn4r"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
