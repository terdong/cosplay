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

package org.cosplay.games.mir

import org.cosplay.*
import prefabs.scenes.*
import CPColor.*
import CPPixel.*

/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII GAME ENGINE FOR SCALA3
            (C) 2021 Rowan Games, Inc.
               ALl rights reserved.
*/

val GREEN_BG = CPColor("0x001000")
val GREEN_FG = CPColor("0x00AF00")
val BG_PX = ' '&&(GREEN_BG, GREEN_BG)
var audioOn = true // By default, the audio is ON.

/**
  *
  */
object CPMirGame:
    /**
      * Entry point for JVM runtime.
      *
      * @param args Ignored.
      */
    def main(args: Array[String]): Unit =
        val gameInfo = CPGameInfo(
            name = "Escape From Mir",
            semVer = "0.0.1",
            termBg = GREEN_BG
        )

        // Initialize the engine.
        CPEngine.init(gameInfo, System.console() == null || args.contains("emuterm"))

        // Start the game & wait for exit.
        try
            CPEngine.startGame(
                new CPFadeShimmerLogoScene(
                    "logo",
                    None,
                    BG_PX,
                    Seq(GREEN_FG),
                    "title",
                    fadeInMs = 3000
                )
            )
        finally CPEngine.dispose()

        sys.exit(0)
