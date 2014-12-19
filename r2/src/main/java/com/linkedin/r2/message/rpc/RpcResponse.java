/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/* $Id$ */
package com.linkedin.r2.message.rpc;

import com.linkedin.r2.message.Response;

/**
 * An object that contains details of an RPC response.<p/>
 *
 * Instances of RpcResponse are immutable and thread-safe. New instances can be created using the
 * {@link RpcResponseBuilder}. An existing RpcResponse can be used as a prototype for
 * building a new RpcResponse using the {@link #builder()} method.
 *
 *
 * @author Chris Pettitt
 * @version $Revision$
 */
public interface RpcResponse extends RpcMessage, Response
{
  /**
   * Returns a {@link RpcResponseBuilder}, which provides a means of constructing a new response using
   * this response as a starting point. Changes made with the builder are not reflected by this
   * response instance.
   *
   * @deprecated R2 RPC is not supported. Please use REST instead.
   * @return a builder for this response
   */
  @Deprecated
  @SuppressWarnings("deprecation")
  RpcResponseBuilder builder();
}
