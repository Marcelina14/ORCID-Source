/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.core.exception;

import java.util.Map;

/**
 * 
 * @author Angel Montenegro
 * 
 */
public class OrcidDuplicatedActivityException extends ApplicationException {
    private static final long serialVersionUID = 4656868314652702814L;

    public OrcidDuplicatedActivityException() {
    }

    public OrcidDuplicatedActivityException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrcidDuplicatedActivityException(String message) {
        super(message);
    }

    public OrcidDuplicatedActivityException(Throwable cause) {
        super(cause);
    }

	public OrcidDuplicatedActivityException(Map<String, String> params) {
		super(params);
	}
}
