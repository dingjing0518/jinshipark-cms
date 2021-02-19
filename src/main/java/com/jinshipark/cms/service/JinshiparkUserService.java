package com.jinshipark.cms.service;

import com.jinshipark.cms.bo.JinshiparkUserBO;
import com.jinshipark.cms.utils.JinshiparkJSONResult;

public interface JinshiparkUserService {
    JinshiparkJSONResult login(JinshiparkUserBO jinshiparkUserBO);

    JinshiparkJSONResult updatePassword(JinshiparkUserBO jinshiparkUserBO);

}
