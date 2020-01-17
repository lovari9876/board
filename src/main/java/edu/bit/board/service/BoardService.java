package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;

	// �Խ��� List�� ���� ����ϴ� ����Ͻ�����
	public List<BoardVO> selectBoardList() {
		return boardMapper.selectBoardList();
	}

	// �Խ��ǿ��� ������ ���� ����: sql�� 2�� �ʿ�(1. step 1���� +1, 2. ����ۼ�)
	public void writeReply(BoardVO boardVO) {
		boardMapper.updateShape(boardVO); // 1
		boardMapper.insertReply(boardVO); // 2
	}

	public void insertBoard(BoardVO boardVO) {
		boardMapper.insertBoard(boardVO);
	}

	public BoardVO selectBoardOne(String bId) {
		return boardMapper.selectBoardOne(bId);
	}

	public void updateBoard(BoardVO boardVO) {
		boardMapper.updateBoard(boardVO);
	}

	public void deleteBoard(String bId) {
		boardMapper.deleteBoard(bId);
	}

}
