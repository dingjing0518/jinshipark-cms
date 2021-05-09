package com.jinshipark.cms.service;

import com.jinshipark.cms.bo.JinshiparkUserBO;
import com.jinshipark.cms.utils.JinshiparkJSONResult;

import java.security.NoSuchAlgorithmException;

public interface JinshiparkUserService {
    JinshiparkJSONResult login(JinshiparkUserBO jinshiparkUserBO) throws NoSuchAlgorithmException;

    JinshiparkJSONResult updatePassword(JinshiparkUserBO jinshiparkUserBO);

}
