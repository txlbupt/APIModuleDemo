/*
 * Copyright 2018 qiugang(thisisqg@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.letusplay.demo.plugin.timeline.model

import io.letusplay.demo.plugin.timeline.model.EventType.CreateEvent
import io.letusplay.demo.plugin.timeline.model.EventType.FollowEvent
import io.letusplay.demo.plugin.timeline.model.EventType.ForkEvent
import io.letusplay.demo.plugin.timeline.model.EventType.WatchEvent

enum class EventType {
  CreateEvent,
  FollowEvent,
  ForkEvent,
  PublicEvent,
  WatchEvent
}

fun transEvent(eventType: String): String {
  return when (eventType) {
    CreateEvent.name -> "created a repository"
    FollowEvent.name -> "started following"
    ForkEvent.name -> "forked"
    WatchEvent.name -> "starred"
    else -> ""
  }
}