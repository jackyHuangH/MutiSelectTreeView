package com.ezreal.multiselecttreeview;

import com.ezreal.treevieewlib.TreeNodeId;
import com.ezreal.treevieewlib.TreeNodePid;
import com.ezreal.treevieewlib.TreeNodeTitle;

/** 测试的数据bean
 * Created by wudeng on 2017/3/28.
 */

public class TypeBeanLong {

    // 注意  这里的 id pid 为 long 类型

    @TreeNodeId
    private long id;
    @TreeNodePid
    private long pid;
    @TreeNodeTitle
    private String text;

    // 除了以上必要的三个属性之外，bean 中可定义任意具体项目中需要的属性
    // 但为避免占用内存过大，节点不应该保存大型 object 数据

    public TypeBeanLong(long id, long pid, String text) {
        this.id = id;
        this.pid = pid;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String name) {
        this.text = name;
    }

}