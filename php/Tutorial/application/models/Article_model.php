<?php
class Article_model extends CI_model
{
    public function articles()
    {
        $articles = $this->db->get('articles')->result_array();
        return $articles;
    }
    public function example()
    {
        // $res = $this->db->query('select * from users')->result_array();  
        $users = $this->db->select('id,name,email')
            ->where('id', 2)
            ->get('users')
            ->result_array();
        $res = $this->db->get('users')->result_array();
        return $users;
    }
}
