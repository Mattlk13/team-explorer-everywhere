// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._AgentStatus;
import ms.tfs.build.buildservice._03._BuildAgent;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._BuildDefinition;
import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildQueueQueryResult;
import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_QueryBuildsResponse;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildServiceHost;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._ContinuousIntegrationType;
import ms.tfs.build.buildservice._03._ControllerStatus;
import ms.tfs.build.buildservice._03._DeleteOptions;
import ms.tfs.build.buildservice._03._Failure;
import ms.tfs.build.buildservice._03._GetOption;
import ms.tfs.build.buildservice._03._InformationField;
import ms.tfs.build.buildservice._03._ProcessTemplate;
import ms.tfs.build.buildservice._03._ProcessTemplateType;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueueStatus;
import ms.tfs.build.buildservice._03._QueuedBuild;
import ms.tfs.build.buildservice._03._RetentionPolicy;
import ms.tfs.build.buildservice._03._Schedule;
import ms.tfs.build.buildservice._03._ScheduleDays;
import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;
import ms.tfs.build.buildservice._03._WorkspaceTemplate;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildQueueWebServiceSoap_QueryBuildsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildQueueQueryResult[] queryBuildsResult;

    public _BuildQueueWebServiceSoap_QueryBuildsResponse()
    {
        super();
    }

    public _BuildQueueWebServiceSoap_QueryBuildsResponse(final _BuildQueueQueryResult[] queryBuildsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryBuildsResult(queryBuildsResult);
    }

    public _BuildQueueQueryResult[] getQueryBuildsResult()
    {
        return this.queryBuildsResult;
    }

    public void setQueryBuildsResult(_BuildQueueQueryResult[] value)
    {
        this.queryBuildsResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("QueryBuildsResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildQueueQueryResult complexObject0 = new _BuildQueueQueryResult();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryBuildsResult = (_BuildQueueQueryResult[]) list0.toArray(
                                new _BuildQueueQueryResult[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
