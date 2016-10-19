package com.example.kevin.helloworld.service;

import com.example.kevin.helloworld.data.Channel;

/**
 * Created by kevin on 10/12/2016.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
