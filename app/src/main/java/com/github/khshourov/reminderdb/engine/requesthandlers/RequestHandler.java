package com.github.khshourov.reminderdb.engine.requesthandlers;

import com.github.khshourov.reminderdb.engine.multiplexer.RequestMultiplexer;
import com.github.khshourov.reminderdb.models.Request;

public interface RequestHandler {
  void register(RequestMultiplexer multiplexer);

  void handle(Request request);
}
