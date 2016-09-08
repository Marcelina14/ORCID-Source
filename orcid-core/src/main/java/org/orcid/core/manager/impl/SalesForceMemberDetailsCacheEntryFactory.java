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
package org.orcid.core.manager.impl;

import javax.annotation.Resource;

import org.orcid.core.salesforce.dao.SalesForceDao;
import org.orcid.core.salesforce.model.MemberDetails;

import net.sf.ehcache.constructs.blocking.CacheEntryFactory;

/**
 * 
 * @author Will Simpson
 *
 */
public class SalesForceMemberDetailsCacheEntryFactory implements CacheEntryFactory {

    @Resource
    private SalesForceDao salesForceDao;

    @Override
    public Object createEntry(Object key) throws Exception {
        SalesForceMemberDetailsCacheKey detailsCacheKey = (SalesForceMemberDetailsCacheKey) key;
        MemberDetails details = salesForceDao.retrieveFreshDetails(detailsCacheKey.getMemberId(), detailsCacheKey.getConsotiumLeadId());
        return details;
    }

}
