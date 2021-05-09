package com.jinshipark.cms.service.impl;

import com.jinshipark.cms.bo.SearchBO;
import com.jinshipark.cms.mapper.JinshiparkReturnmoneyMapper;
import com.jinshipark.cms.mapper.LincensePlateHistoryMapper;
import com.jinshipark.cms.service.SummaryService;
import com.jinshipark.cms.utils.JinshiparkJSONResult;
import com.jinshipark.cms.vo.SummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SummaryServiceImpl implements SummaryService {
    @Autowired
    private LincensePlateHistoryMapper lincensePlateHistoryMapper;

    @Autowired
    private JinshiparkReturnmoneyMapper jinshiparkReturnmoneyMapper;

    @Override
    public JinshiparkJSONResult financialSummary(SearchBO searchBO) throws ParseException {
        List<SummaryVO> result = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("parkId", searchBO.getParkId());
        map.put("startTime", searchBO.getDateForStartTime());
        map.put("endTime", searchBO.getDateForEndTime());
        List<SummaryVO> list = lincensePlateHistoryMapper.summary(map);
        SummaryVO summaryVO = jinshiparkReturnmoneyMapper.summary(map);
        if (list.size() > 0) {
            if (summaryVO != null) {
                list.get(0).setRefundMoney(summaryVO.getRefundMoney());
            }
            result.addAll(list);
        } else {
            if (summaryVO != null) {
                result.add(summaryVO);
            }
        }
        return JinshiparkJSONResult.ok(result);
    }
}
