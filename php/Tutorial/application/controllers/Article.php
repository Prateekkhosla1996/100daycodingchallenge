<?php
class Article extends CI_controller
{
    // Default
    public function index()
    {

        // calling or loading  model 
        $this->load->model('Article_model');
        // loading liabrary
        $this->load->library(array('form_validation', 'email', 'pagination','Hello'));
           echo $this->hello->test();
        // helpers
            echo $this->email->mytest();
        $this->load->helper('text');
        $this->load->helper('common_helper');
        $string = "this is a dummy text string consisting of eleven words";
        echo word_limiter($string, 4);
        // calling or loading views
        $articles = $this->Article_model->articles();
        $data['articles'] = $articles;
        $data['string'] = $string;
        $users = $this->Article_model->example();
        test_method();
        $this->load->view('article', $data);
    }
}
