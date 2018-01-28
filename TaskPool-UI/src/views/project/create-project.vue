<style lang="less">
    @import '../../styles/common.less';
    @import './create-project.less';
</style>

<template>
    <div>
        <Row>
            <Card>
                <div class="step-header-con">
                    <h3>{{ stepData.title }}</h3>
                </div>
                <Form class="step-form" ref="project" :model="project" :rules="stepRules" :label-width="100">
                    <FormItem label="名称：" prop="opinion">
                        <Input :disabled="hasSubmit" v-model="project.projectName" type="textarea" :autosize="{minRows: 1,maxRows: 1}" placeholder="请输入项目名称" />
                    </FormItem>
                    <FormItem label="项目描述：">
                        <Input :disabled="hasSubmit" v-model="project.projectDescription" type="textarea" :autosize="{minRows: 4,maxRows: 6}" placeholder="请输入项目描述" />
                    </FormItem>
                    <FormItem label="">
                        <Button :disabled="hasSubmit" @click="handleSubmit" style="width:100px;" type="primary">确定创建</Button>
                    </FormItem>
                </Form>
                <Steps :current="currentStep" :status="status">
                    <Step v-for="item in stepList1" :title="item.title" :content="item.description" ></Step>
                </Steps>
            </Card>
        </Row>
    </div>
</template>

<script>
  export default {
    name: 'create-project',
    data () {
      return {
        stepList1: [],
        stepData: {
          title: '',
        },
        project: {
          projectName: '',
          projectDescription: '',
        },
        stepRules: {
          projectName: [
            { required: true, message: '请填写项目名称', trigger: 'blur' }
          ],
          projectDescription: [
            { required: true, message: '请填写项目描述', trigger: 'blur' }
          ]
        },
        hasSubmit: false,
        currentStep: 0,
        status: 'wait'
      };
    },
    methods: {
      handleSubmit () {
        this.$refs['project'].validate((valid) => {
          if (valid) {
            this.currentStep += 1;
            this.hasSubmit = true;
          }
        });
      }
    },
    mounted () {
      this.stepList1 = [
        {
          title: '项目创建',
          description: ''
        },
        {
          title: '项目进行',
          description: ''
        },
        {
          title: '项目验收',
          description: ''
        },
        {
          title: '项目完结',
          description: ''
        }
      ];
      this.stepData = {
        title: '创建新的项目',
      };
      this.currentStep = 0;
    }
  };
</script>
