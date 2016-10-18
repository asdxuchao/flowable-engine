/**
 * Activiti app component part of the Activiti project
 * Copyright 2005-2015 Alfresco Software, Ltd. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.activiti.rest.form.service.api.form;

import org.activiti.form.model.CompletedFormDefinition;
import org.activiti.form.model.FormDefinition;

/**
 * @author Yvo Swillens
 */
public class CompletedFormDefinitionResponse extends CompletedFormDefinition {

  private String url;

  public CompletedFormDefinitionResponse(FormDefinition formDefinition, String url) {
    super(formDefinition);
    this.url = url;
  }

  public CompletedFormDefinitionResponse(CompletedFormDefinition completedFormDefinition) {

    super(completedFormDefinition);

    setSubmittedFormId(completedFormDefinition.getSubmittedFormId());
    setSubmittedBy(completedFormDefinition.getSubmittedBy());
    setSubmittedDate(completedFormDefinition.getSubmittedDate());
    setSelectedOutcome(completedFormDefinition.getSelectedOutcome());
    setTaskId(completedFormDefinition.getTaskId());
    setProcessInstanceId(completedFormDefinition.getProcessInstanceId());
    setProcessDefinitionId(completedFormDefinition.getProcessDefinitionId());
    setTenantId(completedFormDefinition.getTenantId());
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
