/*
 * Copyright (C) 2003-2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.crsh.connector.sshd.scp;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public class SCPAction {

  /** . */
  @Option(name = "-r")
  private Boolean recursive;

  /** . */
  @Option(name = "-v")
  private Boolean verbose;

  /** . */
  @Option(name = "-p")
  private Boolean preserve;

  /** . */
  @Option(name = "-t")
  private Boolean source;

  /** . */
  @Option(name = "-f")
  private Boolean sink;

  /** . */
  @Option(name = "-d")
  private Boolean directory;

  /** . */
  @Argument
  private String argument;

  public Boolean isRecursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  public Boolean isVerbose() {
    return verbose;
  }

  public void setVerbose(Boolean verbose) {
    this.verbose = verbose;
  }

  public Boolean isPreserve() {
    return preserve;
  }

  public void setPreserve(Boolean preserve) {
    this.preserve = preserve;
  }

  public Boolean isSource() {
    return source;
  }

  public void setSource(Boolean source) {
    this.source = source;
  }

  public Boolean isSink() {
    return sink;
  }

  public void setSink(Boolean sink) {
    this.sink = sink;
  }

  public Boolean isDirectory() {
    return directory;
  }

  public void setDirectory(Boolean directory) {
    this.directory = directory;
  }

  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  @Override
  public String toString() {
    return "SCPAction[recursive=" + recursive + ",verbose=" + verbose + ",preserve=" + preserve + ",to=" + source +
      ",from=" + sink + ",directory=" + directory + ",argument=" + argument + "]";
  }
}
