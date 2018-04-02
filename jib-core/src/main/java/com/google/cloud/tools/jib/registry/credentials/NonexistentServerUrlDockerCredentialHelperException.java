/*
 * Copyright 2017 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.jib.registry.credentials;

/** Thrown because the credential helper does not have credentials for the specified server URL. */
public class NonexistentServerUrlDockerCredentialHelperException extends Exception {

  NonexistentServerUrlDockerCredentialHelperException(
      String credentialHelper, String serverUrl, String credentialHelperOutput) {
    super(
        "The credential helper ("
            + credentialHelper
            + ") has nothing for server URL: "
            + serverUrl
            + "\n\nGot output:\n\n"
            + credentialHelperOutput);
  }
}