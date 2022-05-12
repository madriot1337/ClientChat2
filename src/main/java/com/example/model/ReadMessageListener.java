package com.example.model;

import com.example.command.Command;

public interface ReadMessageListener {

    void processReceivedCommand(Command command);

}