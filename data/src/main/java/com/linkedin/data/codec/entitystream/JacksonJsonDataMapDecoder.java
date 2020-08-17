/*
   Copyright (c) 2018 LinkedIn Corp.

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

package com.linkedin.data.codec.entitystream;

import com.fasterxml.jackson.core.JsonFactory;
import com.linkedin.data.DataMap;
import com.linkedin.data.codec.AbstractJacksonDataCodec;


public class JacksonJsonDataMapDecoder extends JacksonJsonDataDecoder<DataMap>
{
  public JacksonJsonDataMapDecoder()
  {
    this(AbstractJacksonDataCodec.JSON_FACTORY);
  }

  public JacksonJsonDataMapDecoder(JsonFactory jsonFactory)
  {
    super(jsonFactory, START_OBJECT_TOKEN);
  }
}
