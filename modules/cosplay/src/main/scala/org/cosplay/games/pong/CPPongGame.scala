/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cosplay.games.pong

import org.cosplay.*
import CPColor.*
import CPPixel.*
import prefabs.scenes.CPLogoScene

/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII JVM GAME ENGINE FOR SCALA3
              (C) 2021 Rowan Games, Inc.
                ALl rights reserved.
*/

val BG_PX = '.'&&(C_GRAY2, C_GRAY1)

// Randomly selected color palette.
val palette = CPRand.rand(
    // List of colors palettes: https://designs.ai/colors
    Seq(
        Seq("#ee3423", "#fbce59", "#72659e", "#a8bbce", "#443c64"),
        Seq("#d9b54a", "#369231", "#25616c", "#52318f", "#ff56a2"),
        Seq("#754988", "#4c1264", "#5fb03c", "#ebbcff", "#8dd271"),
        Seq("#e6f18c", "#72b37e", "#437975", "#555c78", "#ffefbc"),
        Seq("#e97a7a", "#8b4f80", "#8b76a5", "#b9c0d5", "#b59bff"),
        Seq("#f5cd54", "#53cef5", "#7d53f5", "#95def5", "#ae95f5"),
        Seq("#8ef560", "#7153f5", "#f552d6", "#a795f5", "#f594e4"),
        Seq("#75f5ae", "#ed53f5", "#f5545b", "#f094f5", "#f5959a"),
        Seq("#f57cb0", "#99f553", "#5399f5", "#bff595", "#95bff5")
    ).map(_.map(CPColor(_)))
)

val C1 = palette.head
val C2 = palette(1)
val C3 = palette(2)
val C4 = palette(3)
val C5 = palette(4)
val CS = Seq(C1, C2, C3, C4, C5)

/**
  * Classic pong game.
  *
  * ### Running Game
  * One-time Git clone & build:
  * {{{
  *     $ git clone https://github.com/nivanov/cosplay.git
  *     $ cd cosplay
  *     $ mvn package
  * }}}
  * to run the game:
  * {{{
  *     $ mvn -f modules/cosplay -P pong exec:java
  * }}}
  *
  * @see https://cosplayengine.com/devguide/pong_game.html
  */
object CPPongGame:
    /**
     * Entry point for JVM runtime.
     *
     * @param args Ignored.
     */
    def main(args: Array[String]): Unit =
        val gameInfo = CPGameInfo(name = "Ascii Pong")

        // Initialize the engine.
        CPEngine.init(gameInfo, System.console() == null || args.contains("emuterm"))

        // Start the game & wait for exit.
        try CPEngine.startGame(
            new CPLogoScene("logo", None, BG_PX, CS, "title"),
            CPPongTitleScene,
            CPPongPlayScene
        )
        finally CPEngine.dispose()

        sys.exit(0)


