/*
 *
 * Copyright (C) 2016 Krishna Kuntala @ Mastek <krishna.kuntala@mastek.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package uk.gov.nhs.digital.telehealth.clinician.service.dao.impl;

import java.util.List;

import uk.gov.nhs.digital.telehealth.clinician.service.entities.DataValueEntity;
import uk.gov.nhs.digital.telehealth.clinician.service.entities.RecordingDeviceDataMaster;

import com.dev.ops.common.dao.generic.GenericDAO;

public interface RecordingDeviceDataDAO extends GenericDAO<RecordingDeviceDataMaster> {
	List<RecordingDeviceDataMaster> fetchRecentMeasurementsHQL(String patientId);

	List<DataValueEntity> fetchRecentMeasurementsSQL(String patientId);

	List<RecordingDeviceDataMaster> fetchPatientMeasurementsByAttributeId(String patientId, int attributeId);
}
