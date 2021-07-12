// Copyright 2021 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.protocol.graphQL.v1.typeSystem;

import org.finos.legend.engine.protocol.graphQL.v1.Directive;

import java.util.Collections;
import java.util.List;

public class FieldDefinition
{
    public String name;
    public TypeReference type;
    public List<InputValueDefinition> argumentDefinitions = Collections.EMPTY_LIST;
    public List<Directive> directives;
}