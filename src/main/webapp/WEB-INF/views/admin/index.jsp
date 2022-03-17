<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<div class="header bg-primary pb-6"  >
    <div class="container-fluid">
        <div class="header-body">
            <div class="row align-items-center py-4">


            </div>
        </div>
    </div>
</div>
<div class="container-fluid mt--6">
    <div class="row">
        <div class="col-xl-8 order-xl-1" style="margin-left: 300px;">
            <div class="card">
                <div class="card-header">
                    <div class="row align-items-center">
                        <div class="col-12">
                            <h3 class="mb-0">Thông tin nhân viên @Model.ten</h3>
                        </div>

                    </div>
                </div>
                <div class="card-body">

                    <div class="pl-lg-4">
                        <div class="row">

                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="tittle">Họ và tên</label>
                                    <input type="text" class="form-control" disabled value="" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="tittle">Quyền truy cập</label>
                                    @if (Model.type == 1)
                                    {
                                        <input type="text" class="form-control" disabled value="Admin" />
                                    }
                                    else if (Model.type == 0)
                                    {
                                        <input type="text" class="form-control" disabled value="Người viết bài" />
                                    }

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Giới tính</label>
                                    @if (Model.gioitinh == null)
                                    {


                                        <input type="text" class="form-control" disabled value="(Trống)" />
                                    }
                                    else
                                    {
                                        if (Model.gioitinh == 1)
                                        {
                                            <input type="text" class="form-control" disabled value="Nữ" />
                                        }
                                        else if (Model.gioitinh == 0)
                                        {
                                            <input type="text" class="form-control" disabled value="Nam" />
                                        }
                                        else if (Model.gioitinh == 2)
                                        {
                                            <input type="text" class="form-control" disabled value="Khác" />
                                        }
                                    }


                                </div>

                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Ngày sinh</label>
                                    <input type="text" class="form-control" disabled value="@Model.ngaysinh.Value.ToString("dd/MM/yyyy")" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Số điện thoại</label>
                                    <input type="text" class="form-control" disabled value="@Model.sdt" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label">Email</label>
                                    <input type="text" class="form-control" disabled value="@Model.email" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Địa chỉ</label>
                                    <input type="text" class="form-control" disabled value="@Model.diachi" />

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Trạng thái</label>
                                    @if (Model.status == 1)
                                    {
                                        <input type="text" class="form-control" disabled value="Hoạt động" />
                                    }
                                    else if (Model.status == 0)
                                    {
                                        <input type="text" class="form-control" disabled value="Đợi duyệt" />
                                    }
                                    else if (Model.status == 2)
                                    {
                                        <input type="text" class="form-control" disabled value="Ẩn" />
                                    }
                                    else if (Model.status == 3)
                                    {
                                        <input type="text" class="form-control" disabled value="Xóa" />
                                    }
                                </div>

                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Ngày tạo</label>
                                    <input type="text" class="form-control" disabled value="@Model.ngaytao" />

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">CMND</label>
                                    <input type="text" class="form-control" disabled value="@Model.cmnd" />

                                </div>
                            </div>
                            @if (Model.ngaysua != null)

                            {
                                <div class="col-lg-6">
                                    <div class="form-group">
                                        <label class="form-control-label" for="input-email">Ngày cập nhật</label>
                                        <input type="text" class="form-control" disabled value="@Model.ngaysua" />

                                    </div>
                                </div>

                            }

                            <div class="col-lg-12">
                                <div class="form-group">
                                    <label class="form-control-label" for="input-email">Ảnh đại diện</label>
                                    <br />
                                    <img src="~/UploadedFiles/images/@Model.anh" style="height:200px;width:200px;margin:10px" id="previewImage" />

                                    <br />
                                </div>
                            </div>
                        </div>


                    </div>
                    <div class="">
                        <a class="btn btn-primary my-4" href="@Url.Action("List","Admin")">OK</a>
                    </div>


                </div>
            </div>
        </div>
    </div>
</div>

