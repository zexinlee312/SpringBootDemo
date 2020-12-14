package com.example.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;

@Data
public class AnotherComponent {
    private boolean enabled;

    private InetAddress remoteAddress;
}
