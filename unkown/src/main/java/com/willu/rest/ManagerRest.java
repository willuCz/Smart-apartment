package com.willu.rest;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import com.willu.model.Tb_bed;
import com.willu.model.Result.Building;
import com.willu.model.Result.Campus;
import com.willu.model.receive.manager.BedModel;
import com.willu.model.receive.manager.BuildingModel;
import com.willu.model.receive.manager.CampusModel;
import com.willu.model.receive.manager.QueryModel;
import com.willu.model.receive.manager.RoomModel;
import com.willu.serviceImpl.manager.Manager;
/**
 * 管理员API
 * @author 赵维禄M
 *
 */
@Component
@Path("manager")
public class ManagerRest {
	
	@Resource(name = "manager")
	Manager manager;	
	
	/**
	 * 校区信息的查询
	 * @return
	 */
	@GET
	@Path("/campus/1")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Campus> getCampus(){
		//List<Campus> list = manager.SelectCampus();
		return null;
	}
	
	/**
	 * 校区信息添加
	 * @param campusModel
	 * @return
	 */
	@POST
	@Path("/campus/2")
	@Produces(MediaType.APPLICATION_JSON)
	public String AddCampus(@RequestBody CampusModel campusModel){
		String result = null ;
		result = manager.AddCampus(campusModel);
		return result;
	}
	
	/**
	 * 校区信息修改
	 * @param campusModel
	 * @return
	 */
	@POST
	@Path("/campus/3")
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateCampus(@RequestBody CampusModel campusModel){
		String result = null ;
		return result;
	}
	
	/**
	 * 校区信息删除
	 * @param campusname
	 * @return
	 */
	@POST
	@Path("/campus/4")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeleteCcampus(@RequestBody String campusname){
		String result = null ;
		result  = manager.DeleteCcampus(campusname);
		return result;
	}
	
	/**
	 * 楼宇信息查询
	 * @param campusname
	 * @return
	 */
	@GET
	@Path("/building/1")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Building> getBuilding(@QueryParam("campusname") String campusname){
		List<Building> list = manager.SelectBuilding(campusname) ;
		return list;
	}
	
	/**
	 * 楼宇信息修改
	 * @param buildingModel
	 * @return
	 */
	@POST
	@Path("/building/2")
	@Produces(MediaType.APPLICATION_JSON)
	public String AddBuilding(@RequestBody BuildingModel buildingModel){
		String result = null ;
		return result;
	}
	
	/**
	 * 楼宇信息修改
	 * @param buildingModel
	 * @return
	 */
	@POST
	@Path("/building/3")
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateBuilding(@RequestBody BuildingModel buildingModel){
		String result = null ;
		return result;
	}
	
	/**
	 * 楼宇信息删除
	 * @param buildingName
	 * @return
	 */
	@POST
	@Path("/building/4")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeleteBuilding(@RequestBody String buildingName){
		String result = null ;
		return result;
	}
	
	/**
	 * 楼层信息查询
	 * @param buildingName
	 * @return
	 */
	@GET
	@Path("/floor/1")
	@Produces(MediaType.APPLICATION_JSON)
	public String SelectFloor(@RequestBody String buildingName){
		String result = null ;
		return result;
	}
	
	/**
	 * 楼层信息添加
	 * @param floorNum
	 * @return
	 */
	@POST
	@Path("/floor/2")
	@Produces(MediaType.APPLICATION_JSON)
	public String AddFloor(@RequestBody String floorNum){
		String result = null;
		return result;
	}
	
	/**
	 * 楼层信息修改
	 * @param floorNum
	 * @return
	 */
	@POST
	@Path("/Floor/3")
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateFloor(@RequestBody String floorNum){
		String result = null ;
		return result;
	}
	
	/**
	 * 楼层信息删除
	 * @param floorNum
	 * @return
	 */
	@POST
	@Path("/floor/4")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeleteFloor(@RequestBody String floorNum){
		String result = null ;
		return result;
	}
	
	/**
	 * 寝室信息查询
	 * @param queryModel
	 * @return
	 */
	@POST
	@Path("/room/1")
	@Produces(MediaType.APPLICATION_JSON)
	@ResponseBody
	public List<RoomModel> SelectRoom(@RequestBody QueryModel queryModel){
		return null;
	}
	
	/**
	 * 寝室信息修改
	 * @param roomModel
	 * @return
	 */
	@POST
	@Path("/room/2")
	@Produces(MediaType.APPLICATION_JSON)
	public String AddRoom(@RequestBody RoomModel roomModel){
		String result = null;
		return result ;
	}
	
	/**
	 * 寝室信息修改
	 * @param roomModel
	 * @return
	 */
	@POST
	@Path("/room/3")
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateRoom(@RequestBody RoomModel roomModel){
		String result = null;
		return result ;
	}
	
	/**
	 * 寝室信息删除
	 * @param roomModel
	 * @return
	 */
	@POST
	@Path("/room/4")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeleteRoom(@RequestBody RoomModel roomModel){
		String result = null;
		return result ;
	}
	
	/**
	 * 床位信息查询
	 * @param queryModel
	 * @return
	 */
	@GET
	@Path("/bed/1")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tb_bed> getBed(@RequestBody QueryModel queryModel){
		List<Tb_bed> list = null ;
		return list;
	}
	
	/**
	 * 床位信息添加
	 * @param bedModel
	 * @return
	 */
	@POST
	@Path("/bed/2")
	@Produces(MediaType.APPLICATION_JSON)
	public String AddBed(@RequestBody BedModel bedModel){
		String result = null;
		return result;
	}
	
	/**
	 * 床位信息修改
	 * @param bedModel
	 * @return
	 */
	@POST
	@Path("/bed/3")
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateBed(@RequestBody BedModel bedModel){
		String result = null;
		return result;
	}
	
	/**
	 * 床位信息删除
	 * @param bedModel
	 * @return
	 */
	@POST
	@Path("/bed/4")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeteleBed(@RequestBody BedModel bedModel){
		String result = null;
		return result;
	}
	
}
