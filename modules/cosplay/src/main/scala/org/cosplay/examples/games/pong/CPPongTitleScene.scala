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

package org.cosplay.examples.games.pong

import org.cosplay.CPColor.*
import org.cosplay.*
import org.cosplay.CPArrayImage.*
import prefabs.shaders.*
import org.cosplay.CPFIGLetFont.*
import org.cosplay.CPCanvas.*
import org.cosplay.CPDim.*
import CPPixel.*
import CPKeyboardKey.*
import prefabs.images.*
import prefabs.scenes.*

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

object CPPongTitleScene extends CPScene("title", None, bgPx):
    private val logoImg = FIG_DOH.render("Pong", C_WHITE).skin(
        (px, _, _) => px.char match
            case ':' => px.withFg(C_GREY70)
            case _ => px
    ).trimBg()

    val helpImg = CPArrayImage(
        prepSeq(
            """
              |    HOW TO PLAY
              |
              |GET 10 POINTS TO WIN
              |
              |
              |    UP       Down
              |  .----.    .----.
              |  | W  |    | S  |
              |  `----'    `----'
              |
              |    [ENTER] Play
              |      [Q] Quit
                """),
        (ch, _, _) => ch match
            case c if c.isLetter => c&C_STEEL_BLUE1
            case '|' | '.' | '`' | '-' | '\'' => ch&C_LIME
            case _ => ch.toUpper&C_DARK_ORANGE
    ).trimBg()
    
    private val logoSpr = new CPImageSprite("logoSpr", 0, 0, 0, logoImg, shaders = Seq(CPFadeInShader(true, 1500, bgPx))):
        override def update(ctx: CPSceneObjectContext): Unit =
            val canv = ctx.getCanvas
            setX((canv.dim.width - logoImg.getWidth) / 2)
            setY((canv.dim.height - logoImg.getHeight) / 20)

    private val helpSpr1 = new CPImageSprite("helpSpr1", 0, 0, 0, helpImg, shaders = Seq(CPFadeInShader(true, 1500, bgPx))):
        override def update(ctx: CPSceneObjectContext): Unit =
            val canv = ctx.getCanvas
            setX((canv.dim.width - helpImg.getWidth) / 2)
            setY((canv.dim.height - helpImg.getHeight))

    // Add scene objects...
    addObject(logoSpr)
    addObject(helpSpr1)
    addObject(CPKeyboardSprite(KEY_LO_Q, _.exitGame()))
    addObject(CPKeyboardSprite(KEY_ENTER, _.switchScene("game")))
