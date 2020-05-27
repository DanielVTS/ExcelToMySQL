package cn.lingnan.controller;

import cn.lingnan.pojo.BasicInformation;
import cn.lingnan.services.BasicInformationService;
import cn.lingnan.util.ExcelReader;
import cn.lingnan.util.ReturnMapHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class FileController {


    private BasicInformationService BasicInformationService;

    @Autowired
    public void setBasicInformationService(BasicInformationService BasicInformationService) {
        this.BasicInformationService = BasicInformationService;
    }

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public Map<String, Object> GetAll() {
        return ReturnMapHandler.getListMap("students", BasicInformationService.getAll());
    }


    @PostMapping("uploadExcelFile")
    public Map ExcelFileHandler(@RequestParam("file") MultipartFile mFile) {
        File file = null;
        try {
            file = File.createTempFile("tmp", null);
            mFile.transferTo(file);
            file.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<BasicInformation> list = ExcelReader.readExcel(file);

        for (BasicInformation data : list) {
            int result = BasicInformationService.insert(data);
            if (result == 0) {
                return ReturnMapHandler.getErrorMap(result);
            }
        }
        return ReturnMapHandler.getSuccessMap();
    }

}
