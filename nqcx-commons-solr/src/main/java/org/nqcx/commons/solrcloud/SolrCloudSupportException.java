/*
 * Copyright 2017 nqcx.org All right reserved. This software is the
 * confidential and proprietary information of nqcx.org ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with nqcx.org.
 */

package org.nqcx.commons.solrcloud;

/**
 * @author wangqing 17/8/18 下午5:01
 */
public class SolrCloudSupportException extends RuntimeException {

    public SolrCloudSupportException() {
        super();
    }

    public SolrCloudSupportException(String msg) {
        super(msg);
    }

    public SolrCloudSupportException(Exception e) {
        super(e);
    }

    public SolrCloudSupportException(String msg, Exception e) {
        super(msg, e);
    }

    public SolrCloudSupportException(Throwable cause) {
        super(cause);
    }
}
