package com.pixelcat.pixelcat.web.base.request;

import com.pixelcat.pixelcat.web.base.BaseRequest;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NameSpaceConfigRequest extends BaseRequest {

    private Long id;

    private List<Long> ids;

    private String textModeContent;

    private String key;

    private String value;

    private Long namespaceId;

    private Integer deleteFlag;

    private String username;

    private Date updateTime;
}
