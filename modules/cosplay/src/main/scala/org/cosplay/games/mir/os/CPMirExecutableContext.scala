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

package org.cosplay.games.mir.os

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

import org.cosplay.games.mir.*

/**
  *
  * @param pid
  * @param args
  * @param con
  * @param rt
  * @param fs
  * @param workDir
  * @param env
  * @param usr
  * @param in
  * @param out
  * @param err
  */
case class CPMirExecutableContext(
    pid: Long,
    args: Seq[String],
    con: CPMirConsole,
    rt: CPMirRuntime,
    clock: CPMirClock,
    fs: CPMirFileSystem,
    workDir: CPMirDirectoryFile,
    env: Map[String, String],
    usr: CPMirUser,
    in: CPMirInputStream,
    out: CPMirOutputStream,
    err: CPMirOutputStream
):
    @transient private var killed = false

    /**
      *
      * @param file
      * @param args
      * @param in
      * @param out
      * @param err
      */
    def fork(
        file: CPMirExecutableFile,
        args: Seq[String],
        in: CPMirInputStream = CPMirInputStream.nullStream(),
        out: CPMirOutputStream = CPMirOutputStream.consoleStream(con),
        err: CPMirOutputStream = CPMirOutputStream.consoleStream(con)): CPMirProcess =
        rt.exec(
            rt.get(pid),
            file,
            args,
            workDir,
            usr,
            env,
            in,
            out,
            err
        )

    /**
      *
      * @return
      */
    def isKilled: Boolean = killed

    /**
      *
      */
    def kill(): Unit = killed = true

